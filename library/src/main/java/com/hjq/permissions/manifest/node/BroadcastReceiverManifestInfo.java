package com.hjq.permissions.manifest.node;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/XXPermissions
 *    time   : 2022/11/11
 *    desc   : BroadcastReceiver 清单信息类
 */
public final class BroadcastReceiverManifestInfo {

    /**
     * 广播的类名
     */
    @NonNull
    public String name = "";

    /**
     * 广播所使用到的权限
     */
    @Nullable
    public String permission;
}