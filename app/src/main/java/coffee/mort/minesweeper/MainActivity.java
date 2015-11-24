package coffee.mort.minesweeper;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(coffee.mort.minesweeper.R.layout.activity_main);

        WebView view = (WebView)findViewById(coffee.mort.minesweeper.R.id.webView);

        view.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;

            }
        });

        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setDomStorageEnabled(true);
        view.getSettings().setDatabaseEnabled(true);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            view.getSettings().setDatabasePath("/data/data/" + view.getContext().getPackageName() + "/databases/");
        }
        view.loadUrl("file:///android_asset/www/index.html");
    }
}
