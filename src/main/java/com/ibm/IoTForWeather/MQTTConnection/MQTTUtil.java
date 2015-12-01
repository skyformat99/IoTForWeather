package com.ibm.IoTForWeather.MQTTConnection;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public abstract class MQTTUtil {
	
//		private final static String SERVER_SUFFIX = ".messaging.internetofthings.ibmcloud.com";
//		private final static String DEFAULT_DEVICE_TYPE="WatsonMotors";
//		private final static String DEFAULT_EVENT_ID = "eid";
//		private final static String DEFAULT_CMD_ID = "cid";
//		
//		private static final String org="2uwqwc";
//		private static final String appid="WatsonFuelTest";
//		private static final String key="a-2uwqwc-m1repljvyb";
//		private static final String token="&E5SvMhW&Ab7fDiQHK";
//		
//		
//		//private static final String isSSL="T"; assumed to be true
	
		private static Properties configurationProperties;
		
		/**
		 * This method sets the properties from the config file
		 * @param filePath
		 * @return
		 * @exception IOException
		 */
		public static void setMQTTProperties(String filePath) {

			try {
				InputStream in = new BufferedInputStream(new FileInputStream(
						filePath));
				MQTTUtil.configurationProperties.load(in);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

		public static String getServerSuffix() {
			return MQTTUtil.configurationProperties
					.getProperty("SERVER_SUFFIX");
		}

		public static String getDefaultDeviceType() {
			return MQTTUtil.configurationProperties
					.getProperty("DEFAULT_DEVICE_TYPE");
		}

		public static String getDefaultEventId() {
			return MQTTUtil.configurationProperties
					.getProperty("DEFAULT_EVENT_ID");
		}

		public static String getDefaultCmdId() {
			return MQTTUtil.configurationProperties
					.getProperty("DEFAULT_CMD_ID");
		}

		public static String getOrg() {
			return MQTTUtil.configurationProperties
					.getProperty("ORG");
		}

		public static String getAppid() {
			return MQTTUtil.configurationProperties
					.getProperty("APP_ID");
		}

		public static String getKey() {
			return MQTTUtil.configurationProperties
					.getProperty("KEY");
		}

		public static String getToken() {
			return MQTTUtil.configurationProperties
					.getProperty("TOKEN");
		}
	}

