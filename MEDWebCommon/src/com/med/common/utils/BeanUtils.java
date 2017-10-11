package com.med.common.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;


public class BeanUtils {
	
	public static Map<String, Object> inspectBean(Object data) throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			BeanInfo beanInfo = Introspector.getBeanInfo(data.getClass());
			for (PropertyDescriptor propertyDesc : beanInfo.getPropertyDescriptors()) {
			    String propertyName = propertyDesc.getDisplayName();
			    Object value = propertyDesc.getReadMethod().invoke(data);
			    if (!ObjectUtils.isEmpty(value) && !propertyName.equals("class"))
			    	result.put(propertyName, value);
			}
		}catch (Exception e) {
			throw e;
//			return null;
		}
		return result;
	}
	
	public static Object dynamicSetter(String variableName, Object valueToSet, Object objectOfClass) throws Exception{
		 //I want to do the exact same thing as it does when setting the value using the below statement
        //objectOfClass.setX(valueToBeSet);
        Class clazz = objectOfClass.getClass();
        try{
        	BeanInfo beanInfo = Introspector.getBeanInfo(clazz, Object.class); // get bean info
            PropertyDescriptor[] props = beanInfo.getPropertyDescriptors(); // gets all info about all properties of the class.
            for (PropertyDescriptor descriptor : props) {
                String property = descriptor.getDisplayName();
                if(property.equals(variableName)) {
                    String setter = descriptor.getWriteMethod().getName();
                    Class parameterType = descriptor.getPropertyType();
                    Method setterMethod = clazz.getDeclaredMethod(setter, parameterType); //Using Method Reflection
                    setterMethod.invoke(objectOfClass, valueToSet);
                }
            }
        }catch (Exception e) {
        	throw e;
//        	return null;
		}
        return objectOfClass;
	}

}