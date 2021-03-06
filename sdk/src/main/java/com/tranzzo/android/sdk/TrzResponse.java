package com.tranzzo.android.sdk;

/**
 * Represents request execution result.
 */
public class TrzResponse {
    
    public final boolean success;
    public final String body;
    
    /**
     * @param success request execution outcome
     * @param body    response body (either successful or from error stream)
     */
    public TrzResponse(boolean success, String body) {
        this.success = success;
        this.body = body;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrzResponse{");
        sb.append("success=").append(success);
        sb.append(", body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
