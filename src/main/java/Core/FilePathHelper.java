package Core;

import java.io.File;

public class FilePathHelper {

    public static final String dir = System.getProperty("user.dir");
    static File f = new File(dir);
    static String filepath = f.getParent();
    public static final String FileBathInCore = filepath+"/RestAzureDemoTest/src/main/java/Repository/LocalRepo/";

    public static final String postApiPath = FileBathInCore+"emoloyeeRegPost.json";
    public static final String putApiPath =  FileBathInCore+"employeeRegPut.json";
    public static final String WorkWavePostApiPath=FileBathInCore+"WorkWavePostLogin.json";




}