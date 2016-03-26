LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

OPENCVROOT:= /home/chanst/文档/OpenCV-android-sdk
OPENCV_CAMERA_MODULES:=on
OPENCV_INSTALL_MODULES:=on
OPENCV_LIB_TYPE:=SHARED

include ${OPENCVROOT}/sdk/native/jni/OpenCV.mk

LOCAL_SRC_FILES := ImgFun.cpp
LOCAL_LDLIBS     += -llog -ldl
LOCAL_MODULE := ImgFun

include $(BUILD_SHARED_LIBRARY)
