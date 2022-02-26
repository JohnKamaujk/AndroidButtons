package com.example.febproject

import android.content.Intent
import android.content.pm.PackageManager
import android.media.MediaScannerConnection
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class IntentActivity : AppCompatActivity() {
    var ButttonSMS:Button?=null
    var ButtonSTK:Button?=null
    var ButtonEMAIL:Button?=null
    var ButtonSHARE:Button?=null
    var ButtonCALL:Button?=null
    var ButtonCAMERA:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        ButttonSMS=findViewById(R.id.Btn_sms)
        ButtonSTK=findViewById(R.id.Btn_stk)
        ButtonEMAIL=findViewById(R.id.Btn_email)
        ButtonSHARE=findViewById(R.id.Btn_share)
        ButtonCALL=findViewById(R.id.Btn_Call)
        ButtonCAMERA=findViewById(R.id.Btn_Camera)
        ButttonSMS!!.setOnClickListener {
            val uri =Uri.parse("smsto:0745419231")
            val intent =Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body", "Hello sir,..")
            startActivity(intent)
        }
        ButtonSTK!!.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        ButtonEMAIL!!.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "glory@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Madam,...")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        ButtonSHARE!!.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")
            startActivity(shareIntent)
        }

        ButtonCALL!!.setOnClickListener {
          val intent=Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ "0745419231"))
            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    android.Manifest.permission.CALL_PHONE
            )!=PackageManager.PERMISSION_GRANTED
            ){
                ActivityCompat.requestPermissions(
                    this@IntentActivity ,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else{
                startActivity(intent)

            }
        ButtonCAMERA!!.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)

        }
        }

    }
}