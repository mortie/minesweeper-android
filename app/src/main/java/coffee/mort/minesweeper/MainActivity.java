package coffee.mort.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView)findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/www/index.html");
    }
}
