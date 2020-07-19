package com.codekidlabs.storagechooser;

import androidx.annotation.NonNull;

import java.io.File;

public interface FileCreationHelper {
    boolean createDirectory(@NonNull String path);
}
