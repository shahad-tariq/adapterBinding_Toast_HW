package com.example.adapterbinding_toast_hw

import android.widget.EditText
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData

@BindingAdapter(value = ["theText" ])
fun showTosat(view: EditText, theText: LiveData<String>) {
    if(!theText.value.isNullOrEmpty())
         Toast.makeText(view.getContext().applicationContext,
            "${theText.value}", Toast.LENGTH_LONG).show()


}