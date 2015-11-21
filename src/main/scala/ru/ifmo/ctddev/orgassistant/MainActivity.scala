package ru.ifmo.ctddev.orgassistant

import android.app.Activity
import android.os.Bundle
import android.app.AlertDialog.Builder
import android.app._
import android.content.DialogInterface.OnClickListener
import android.content.{Context, DialogInterface, Intent}
import android.location.{Location, LocationListener, LocationManager}
import android.os.{Bundle, Handler, SystemClock}
import android.text.{Editable, TextWatcher}
import android.util.Log
import android.view.{Menu, MenuItem, View, ViewGroup}
import android.widget.AdapterView.{OnItemClickListener, OnItemLongClickListener}
import android.widget._

/**
 * Created by volhovm on 11/21/15.
 */
class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}
