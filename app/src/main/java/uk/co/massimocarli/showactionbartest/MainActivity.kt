package uk.co.massimocarli.showactionbartest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    supportActionBar?.run {
      setHomeButtonEnabled(true)
    }
  }

  fun showActionBar(view: View) {
    supportActionBar?.show()
  }

  fun hideActionBar(view: View) {
    supportActionBar?.hide()
  }
}
