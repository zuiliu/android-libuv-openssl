/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_xgn_WebSocket */

#ifndef _Included_com_xgn_WebSocket
#define _Included_com_xgn_WebSocket
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_xgn_WebSocket
 * Method:    init
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_xgn_WebSocket_init
  (JNIEnv *, jobject);

/*
 * Class:     com_xgn_WebSocket
 * Method:    connect
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_xgn_WebSocket_connect
  (JNIEnv *, jobject);

/*
 * Class:     com_xgn_WebSocket
 * Method:    send
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_xgn_WebSocket_send
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_xgn_WebSocket
 * Method:    close
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_xgn_WebSocket_close
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
