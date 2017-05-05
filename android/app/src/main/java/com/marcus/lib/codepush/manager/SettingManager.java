package com.marcus.lib.codepush.manager;

/**
 * Created by marcus on 17/4/24.
 */

import com.facebook.react.ReactPackage;
import com.marcus.lib.codepush.MMCodePushConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用这个单例来存储一些初始化时的个性参数
 */
public class SettingManager {

    private static SettingManager instance = null;

    private String appId;
    private String decryptKey;
    private String serverUrl;
    private String storeRootDir; // FIXME

    private List<ReactPackage> customReactPackageList;

    public static SettingManager getInstance() {
        if (null == instance) {
            instance = new SettingManager();
        }
        return instance;
    }

    private SettingManager() {
        if (null == customReactPackageList) {
            customReactPackageList = new ArrayList<>();
        }
    }

    public void addCustomReactPackage(ReactPackage reactPackage) {
        if (null != customReactPackageList) {
            customReactPackageList.add(reactPackage);
        }
    }

    public void removeCustomReacPackage(ReactPackage reactPackage) {
        if (null != customReactPackageList) {
            customReactPackageList.remove(reactPackage);
        }
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDecryptKey() {
        return decryptKey;
    }

    public void setDecryptKey(String decryptKey) {
        this.decryptKey = decryptKey;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getStoreRootDir() {
        return storeRootDir;
    }

    public void setStoreRootDir(String storeRootDir) {
        this.storeRootDir = storeRootDir;
    }

    public String getBundleFileDir() {
        return storeRootDir + "/" + MMCodePushConstants.BUSINESS_STORE_FOLDER_PREFIX;
    }

    public String getBundleFileTmpDir() {
        return storeRootDir + "/" + MMCodePushConstants.BUSINESS_TEMP_FOLDER_PREFIX;
    }

    public List<ReactPackage> getCustomReactPackageList() {
        return customReactPackageList;
    }

    public void setCustomReactPackageList(List<ReactPackage> customReactPackageList) {
        this.customReactPackageList = customReactPackageList;
    }

    public void setBundleFileRootDir(String rootDir) throws IllegalArgumentException {

    }

}
