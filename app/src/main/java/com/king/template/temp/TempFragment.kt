package com.king.template.temp

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.king.template.R
import com.king.template.app.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@AndroidEntryPoint
class TempFragment : BaseFragment<TempViewModel,ViewDataBinding>() {

    companion object{
        fun newInstance(): TempFragment{
            return TempFragment()
        }
    }

    override fun initData(savedInstanceState: Bundle?) {
        super.initData(savedInstanceState)

        viewModel.liveData.observe(viewLifecycleOwner){
            updateUI(it)
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.temp_fragment
    }

    private fun updateUI(data: Any?){

    }
}