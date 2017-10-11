package com.med.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.Weeks;

public class DateUtils {
	
	
	public static SimpleDateFormat ddMMyy = new SimpleDateFormat("dd/MM/yy");
	/**
	 * "2017-10-01T17:00:00.000Z"
	 */
	public static SimpleDateFormat yyyyMMddTHHmmssSSSZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	
	/**
	 * SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sssZ")
	 */
	public static SimpleDateFormat yyyyMMddTHHmmsssZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm.sssZ");
	
	/**
	 * SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
	 */
	public static SimpleDateFormat yyyyMMddTHHmmssZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	/**
	 * SimpleDateFormat("yyyyMMddHHmmss")
	 */
	public static SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");
	/**
	 * SimpleDateFormat("dd.MM.yy HH:mm")
	 */
	public static SimpleDateFormat ddMMyyHHmm = new SimpleDateFormat("dd/MM/yy HH:mm");

	public static Date getCurrentDate() {
		return Calendar.getInstance().getTime();
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public static Calendar shiftToNearestMonday(Calendar calendar) {
		Integer days = 0;
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			days = 1;
			break;
		case 2:
			days = 0;
			break;
		case 3:
			days = -1;
			break;
		case 4:
			days = -2;
			break;
		case 5:
			days = -3;
			break;
		case 6:
			days = 3;
			break;
		case 7:
			days = 2;
			break;
		}
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return calendar;
	}

	public static Calendar shiftToNearestFriday(Calendar calendar) {
		Integer days = 0;
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			days = -2;
			break;
		case 2:
			days = -3;
			break;
		case 3:
			days = 3;
			break;
		case 4:
			days = 2;
			break;
		case 5:
			days = 1;
			break;
		case 6:
			days = 0;
			break;
		case 7:
			days = -1;
			break;
		}
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return calendar;
	}

	public static Date shiftDateByDay(Date date, Integer day) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, day);
		return c.getTime();
	}

	public static Date shiftDateByWeek(Date date, Integer week) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.WEEK_OF_YEAR, week);
		return c.getTime();
	}

	public static Integer weeksBetweenDate(Date start, Date end) {
		DateTime startDate = new DateTime(start);
		DateTime endDate = new DateTime(end);
		return Weeks.weeksBetween(startDate, endDate).getWeeks() + 1;
	}

	public static String convertDateToString(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").format(date);
	}

	public static String convertDateToDatabaseFormatString(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}

	public static Date convertStringToDate(String date) throws ParseException {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(date);
	}

	public static String convertDateToDateOnlyFormatString(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date).split(" ")[0];
	}

	public static String convertDateToTimeOnlyFormatString(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date).split(" ")[1];
	}

	public static long getDifferenceDays(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public static boolean IsOverlap(Date startDateA, Date endDateA, Date startDateB, Date endDateB) {

		if (startDateA.before(endDateB) && endDateA.after(startDateB)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDateBetween(Date d1, Date d2, Date input) {
//		 return (input.after(d1) && input.before(d2));
		return d1.compareTo(input) * input.compareTo(d2) >= 0;
	}

	public static Integer getDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_WEEK);
	}
	
	public static Date shiftDateByDayId(Date date,Integer dayId){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, dayId+1);
		return c.getTime();
	}
	
	public static Date addTimeToDate(Date time,Date date){
		
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(date.getTime());
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(time.getTime());
		c1.set(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
		c1.set(Calendar.MINUTE,c2.get(Calendar.MINUTE));
		return c1.getTime();
	}
	public static Date addTimeToDate(Date date,int hour,int minute){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date.getTime());
		c.add(Calendar.HOUR, hour);
		c.add(Calendar.MINUTE,minute);
		return c.getTime();
	}
	public static Date minusTimeToDate(Date date,int hour,int minute){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date.getTime());
		c.add(Calendar.HOUR, hour*-1);
		c.add(Calendar.MINUTE,minute*-1);
		return c.getTime();
	}
	public static Date setTimeToDate(Date date,int hour,int minute){
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date.getTime());
		c.set(Calendar.HOUR_OF_DAY,hour);
		c.set(Calendar.MINUTE,minute);
		return c.getTime();
	}
	public static boolean isSameDate(Date date1,Date date2){
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		return fmt.format(date1).equals(fmt.format(date2));
	}
	public static Long timeDuration(Date start,Date end){
		return end.getTime()-start.getTime();
	}
	public static Date setNewDate(Date newDate){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(newDate.getTime());
		return c.getTime();
	}
	public static Date getDate(Long date){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date);
		return c.getTime();
	}
	public static int getDuration(int calendarField,Date start,Date end){
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(start.getTime());
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(end.getTime());
		return c2.get(calendarField)-c1.get(calendarField);
	}

}
