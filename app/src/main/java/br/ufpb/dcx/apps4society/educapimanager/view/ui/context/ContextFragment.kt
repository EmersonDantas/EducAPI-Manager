package br.ufpb.dcx.apps4society.educapimanager.view.ui.context

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.ufpb.dcx.apps4society.educapimanager.R
import br.ufpb.dcx.apps4society.educapimanager.model.Context

class ContextFragment : Fragment() {

    private lateinit var layManager : LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var contexts : ArrayList<Context>
    private var TAG : String = "CreateContextFragmentName"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_context, container, false)

        recyclerView = root.findViewById(R.id.context_recycle_view)
        layManager = LinearLayoutManager(context)
        contexts = ArrayList<Context>()

        contexts.add(Context(null, "Animais", null, null, null, null))
        contexts.add(Context(null, "Veículos", null, null, null, null))
        contexts.add(Context(null, "Casa", null, null, null, null))
        contexts.add(Context(null, "Escola", null, null, null, null))
        contexts.add(Context(null, "Cidade", null, null, null, null))
        contexts.add(Context(null, "Cidade", null, null, null, null))
        contexts.add(Context(null, "Cidade", null, null, null, null))
        contexts.add(Context(null, "Cidade", null, null, null, null))
        contexts.add(Context(null, "Cidade", null, null, null, null))

        return root
    }

    fun fillRecycleView(){
        recyclerView.layoutManager = layManager
        recyclerView.adapter = ContextListAdapter(contexts)
    }

    override fun onResume() {
        super.onResume()
        fillRecycleView()
        Log.i(TAG,"AQUI ESTOU MAIS UM DIA")
    }
}