package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class Login : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_login, container, false)

        val username = view.findViewById<EditText>(R.id.userName)
        val password = view.findViewById<EditText>(R.id.password)
        val loginBtn: MaterialButton = view.findViewById(R.id.loginBtn)
        val forgetPassword = view.findViewById<TextView>(R.id.forgetPassword)
        val signUpClick = view.findViewById<TextView>(R.id.signupBtn)

        signUpClick.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_signUp)
        }

        return view
    }

}