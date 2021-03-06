package com.nekolaboratory.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.nekolaboratory.EmulatorDetector
import android.os.Build
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var check_text = this.findViewById<TextView>(R.id.check_text)
        
        var text = "Basic check: " + EmulatorDetector.checkBasic() +
        "\nBuild.PRODUCT: " + Build.PRODUCT +
        "\nBuild.MANUFACTURER: " + Build.MANUFACTURER +
        "\nBuild.BRAND: " + Build.BRAND + 
        "\nBuild.DEVICE: " + Build.DEVICE + 
        "\nBuild.MODEL: " + Build.MODEL +
        "\nBuild.HARDWARE: " + Build.HARDWARE + 
        "\nBuild.FINGERPRINT: " + Build.FINGERPRINT

        Log.d("Emudetect",text)
        check_text.setText(text)

    }
}
