package com.sini.contactsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sini.contactsapp.databinding.ActivityMainBinding

//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    lateinit var floatingActionButton: FloatingActionButton
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        floatingActionButton = findViewById(R.id.floatingActionButton)
//        floatingActionButton.setOnClickListener {
//            val intent= Intent(this,MainActivity2::class.java)
//            startActivity(intent)
//
//        }
//    }

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displaycontacts()
        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this,AddContacts::class.java)
            startActivity(intent)
        }
    }

//    override fun onResume() {
//        super.onResume()
//        displaycontacts()
//    }


    fun displaycontacts() {
        var contact1 = Contacts(
            "https://i.pinimg.com/236x/0e/73/6c/0e736c83999a1c200fe8f0b506ce00cd.jpg",
            "Mary",
            " 0701499964","marymarya@gmail.com"
        )
        var contact2 = Contacts(
            "https://i.pinimg.com/474x/fb/98/5d/fb985d93d56e900aa5b479a6271f4eba.jpg",
            "Angela",
            "07123456","angiebaddie@gmail.comm"
        )
        var contact3 = Contacts(
            "https://i.pinimg.com/236x/27/20/6c/27206cd681f2a9b4b00112388bb09f93.jpg",
            "Karis",
            "0113668094","kariskaris@gmail.com"
        )
        var contact4 = Contacts(
            "https://i.pinimg.com/236x/89/a8/f4/89a8f4ac19c1b567711b311a311815d0.jpg",
            "Simiyu",
            "0113668094","simiyumorgan@gmail.com"
        )
        var contact5 = Contacts(
            "https://i.pinimg.com/236x/5b/a3/98/5ba39843ace084129590d4dbd14442ff.jpg",
            "Seneca",
            "0113668094","seneca6@gmail.com"
        )
        var contact6 = Contacts(
            "https://i.pinimg.com/236x/49/50/ea/4950ea24fe40bf3aef846592540de89d.jpg",
            "Seneca",
            "0713030706","marysnaidaa@gmail.com"
        )
        var c = listOf(contact2, contact1, contact3, contact4, contact6, contact5)

        binding.rvcontacts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val namesAdapter = ContactrvAdapter(c)
        binding.rvcontacts.adapter = namesAdapter
    }
}
