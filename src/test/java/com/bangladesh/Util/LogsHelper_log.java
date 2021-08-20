package com.bangladesh.Util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsHelper_log 
{
	private static boolean root = false;
                         // root is variable name = boolean gives result true or false
	public static Logger getLogs(Class cls) {// Logger is class,getlogs is method name ,class is datatype,cls is variable
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j new");
		// class              
		root = true;
		return Logger.getLogger(cls);
	}

}



