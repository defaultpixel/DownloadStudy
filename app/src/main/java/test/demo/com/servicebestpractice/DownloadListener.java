package test.demo.com.servicebestpractice;

/**
 * Created by Administrator on 2017/10/16.
 */

public interface DownloadListener {

    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();

}
