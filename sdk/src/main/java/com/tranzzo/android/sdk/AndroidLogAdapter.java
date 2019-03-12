package com.tranzzo.android.sdk;

class AndroidLogAdapter implements Log {
    
    @Override
    public void error(String message, Throwable ex) {
        android.util.Log.e("Tranzzo", message, ex);
    }
    
    @Override
    public void error(String message) {
        android.util.Log.e("Tranzzo", message);
    }
    
    @Override
    public void debug(String message) {
        android.util.Log.d("Tranzzo", message);
    }
}
