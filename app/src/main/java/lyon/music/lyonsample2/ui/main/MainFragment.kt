package lyon.music.lyonsample2.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import lyon.music.lyonsample2.R

/**
 * https://www.hangge.com/blog/cache/detail_2294.html
 */
class MainFragment : Fragment() {
    val TAG = "MainFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.main_fragment, container, false)

        return view
    }



}