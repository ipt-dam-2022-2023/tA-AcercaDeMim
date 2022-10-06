package pt.ipt.dam2022.acercademim

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find the button
        findViewById<Button>(R.id.btShowNickname).setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        // write here the button action
        // make a reference to the textView (to present the nickname)
        val nicknameText = findViewById<TextView>(R.id.nicknameTextView)
        // make a reference to the textbox where user will write the nickname
        val nicknameTextBox = findViewById<EditText>(R.id.nicknameTextBox)

        // write the nickname to the TextView
        nicknameText.text = nicknameTextBox.text
        // change visibility
        nicknameText.visibility = View.VISIBLE
        nicknameTextBox.visibility = View.GONE
        view.visibility = View.GONE // hide the button

        // hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}