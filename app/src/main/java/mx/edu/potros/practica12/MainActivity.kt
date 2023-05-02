package mx.edu.potros.practica12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class MainActivity : AppCompatActivity() {
    private val File = 1
    private val database = Firebase.database
    val myRef = database.getReference("user")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadImageView: ImageView = findViewById(R.id.uploadImageView)
        uploadImageView.setOnClickListener {
            fileUpload()
        }
    }
    fun fileUpload(){
        val intent= Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
    }
}