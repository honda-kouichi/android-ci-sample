package sample.android_ci_sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.textView) as TextView
        textView.text = "versionName:${this.packageManager.getPackageInfo(this.packageName, 0).versionName}" +
                " versionCode:${this.packageManager.getPackageInfo(this.packageName, 0).versionCode}"
    }
}
