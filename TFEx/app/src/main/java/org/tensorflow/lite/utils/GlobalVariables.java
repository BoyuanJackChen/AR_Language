package org.tensorflow.lite.utils;

import org.tensorflow.lite.models.Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GlobalVariables {
	public final static int CANCELED = -1;
	public final static int PICK_PHOTO = 0;
	public final static int TAKE_PICTURE = 1;
	public final static int CROP_PHOTO = 2;
	public static int REC_INDEX = 0;
	public static List<Model> list = new ArrayList<>();  // Saves the recognition results. Important!

	// Message type
	public final static int MSG_TEXT = 1; // Text
	public final static int MSG_IMAGE = 2;// Images
	public final static int MSG_AUDIO = 3;// Audio
	public final static int AVATAR_USER = 4;// avatar
	public final static int APK = 5; // apk upgrade dir
	public final static int TEMP = 6;// temporary file dir
	public final static int HTML = 7;// 压缩文件夹
	public final static int REQUEST = 10;
	public final static int EMOTION_NUMBER_PAGE = 28;// 每页28个表情
	public final static String ROOT_PATH = android.os.Environment.getExternalStorageDirectory() + "/org.tensorflow.lite/";// Root dir
	public final static String IMAGE_FLODER = "/image/";// Image folder address
	public final static String AUDIO_FOLDER = "/audio/";// Audio folder address
	public final static String AVATAR_FOLDER = ROOT_PATH + "avatar/";// 联系人头像文件夹
	public final static String HTML_FOLDER = ROOT_PATH + "html/";// 网页文件夹
	public final static String LOG_FOLDER = ROOT_PATH + "log/";// 日志文件夹
	public final static String APK_PATH = ROOT_PATH + "apk/";// 系统安装包路径
	public final static String TEMP_PATH = ROOT_PATH + "temp/";// 临时目录

}
