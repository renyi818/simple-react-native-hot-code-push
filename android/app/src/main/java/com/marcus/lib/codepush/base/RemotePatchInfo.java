package com.marcus.lib.codepush.base;

import com.marcus.lib.codepush.data.result.RemotePatchInfoResult;

/**
 * Created by marcus on 17/3/23.
 */

public class RemotePatchInfo {

    private String hashCode;
    private String downloadUrl;

    public RemotePatchInfo() {
    }

    public RemotePatchInfo(String hashCode, String downloadUrl) {
        this.hashCode = hashCode;
        this.downloadUrl = downloadUrl;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void initWithResult(RemotePatchInfoResult result) {
        this.hashCode = result.getHashCode();
        this.downloadUrl = result.getDownloadUrl();
    }
}