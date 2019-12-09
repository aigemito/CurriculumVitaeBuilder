package com.emito.curriculumvitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SkillActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
    }

    fun OnCancel(view: View) {
        finish()
    }

    fun onSubmit(view: View) {
        Toast.makeText(this,"New Still is added Successfully.",Toast.LENGTH_LONG).show()
        finish()
    }
}
