node {
   def mvnHome
   try {
         stage('GOGS Checkout') {
          notifyBuild('start')
          git credentialsId: 'BestPukapon', url: 'http://csigit.southeastasia.cloudapp.azure.com:3000/CSI/MEDWebBackend'
          mvnHome = tool 'M3'
        }
          stage('Build') {
          echo 'Build - Backend'
          if (isUnix()) {
              sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
          } else {
              bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
          }
        }
          stage('Test') {
            echo 'Test - Backend'
        }
          stage('Deploy') {
            echo 'Deploy - Backend'
			sh "scp /var/jenkins_home/workspace/MEDWebBackend-Pipeline/MEDWebService/target/MEDWebService.war root@203.131.209.132:/opt/wildfly/standalone/deployments/MEDWebService.war"
			sh "ssh root@203.131.209.132 nohup /root/startHttp.sh"
        }
         stage('Results') {
            echo 'Results - Backend'
            archive 'target/*.jar'
        }
      } catch (e) {
       // If there was an exception thrown, the build failed
       currentBuild.result = "failure"
       throw e
     } finally {
       // Success or failure, always send notifications
       notifyBuild(currentBuild.result)
     }
}
def notifyBuild(String buildStatus = 'start') {
     // build status of null means successful
     buildStatus =  buildStatus ?: 'success'

     // Default values
     def colorName = 'RED'
     def colorCode = '#FF0000'
     def subject = "*${buildStatus}* ${env.JOB_NAME}#${env.BUILD_NUMBER}"
     def summary = "${subject} (<${env.BUILD_URL}|OPEN>)"
     def sumary = " \nby ${currentBuild.displayName}"

     // Override default values based on build status
     if (buildStatus == 'start') {
       color = 'warning'
       colorCode = '#daa038'
     } else if (buildStatus == 'success') {
       color = 'good'
       colorCode = '#36a64f'
     } else {
       color = 'danger'
       colorCode = '#d00000'
     }

     // Send notifications
    slackSend color: color, message: summary, teamDomain: 'medtu', token: 'ShsKNwcBjJ71CSOUWE6guhE9'
   }
