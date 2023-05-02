package mx.edu.potros.practica12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.ktx.Firebase
import com.google.firebase.database
import com.google.firebase.storage.FirebaseStorage

class MainActivity : AppCompatActivity() {
    private val File = 1
    private val database = Firebase.database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}