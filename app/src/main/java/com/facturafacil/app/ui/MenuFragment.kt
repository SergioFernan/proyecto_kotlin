package com.facturafacil.app.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.facturafacil.app.databinding.FragmentMenuBinding
import com.facturafacil.app.model.MenuOption
import com.facturafacil.app.ui.adapter.MenuAdapter

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    private var listener: OnMenuItemSelectedListener? = null

    private val options = listOf(
        MenuOption(ID_PROFILE, "Perfil", "Datos del usuario", android.R.drawable.ic_menu_myplaces),
        MenuOption(ID_PHOTOS, "Fotos", "Facturas y comprobantes", android.R.drawable.ic_menu_gallery),
        MenuOption(ID_VIDEO, "Video", "Guía rápida de uso", android.R.drawable.ic_media_play),
        MenuOption(ID_WEB, "Web", "Consulta de portales", android.R.drawable.ic_menu_view),
        MenuOption(ID_ACTIONS, "Botones", "Registrar y consultar", android.R.drawable.ic_menu_manage)
    )

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? OnMenuItemSelectedListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = MenuAdapter(options) { option ->
            listener?.onMenuItemSelected(option.id)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    interface OnMenuItemSelectedListener {
        fun onMenuItemSelected(menuId: String)
    }

    companion object {
        const val ID_PROFILE = "profile"
        const val ID_PHOTOS = "photos"
        const val ID_VIDEO = "video"
        const val ID_WEB = "web"
        const val ID_ACTIONS = "actions"
    }
}
