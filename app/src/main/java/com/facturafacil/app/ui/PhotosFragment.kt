package com.facturafacil.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.facturafacil.app.databinding.FragmentPhotosBinding
import com.facturafacil.app.model.PhotoItem
import com.facturafacil.app.ui.adapter.PhotoAdapter

class PhotosFragment : Fragment() {

    private var _binding: FragmentPhotosBinding? = null
    private val binding get() = _binding!!

    private val items = listOf(
        PhotoItem("Factura de energía", "Pago pendiente para el 18 de abril.", android.R.drawable.ic_menu_camera),
        PhotoItem("Recibo de internet", "Comprobante del último pago realizado.", android.R.drawable.ic_menu_report_image),
        PhotoItem("Factura de agua", "Servicio con descuento por pronto pago.", android.R.drawable.ic_menu_slideshow),
        PhotoItem("Administración", "Soporte fotográfico del recibo del mes.", android.R.drawable.ic_menu_gallery)
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhotosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.photosRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.photosRecyclerView.adapter = PhotoAdapter(items) { photo ->
            binding.photoDescription.text = photo.description
        }
        binding.photoDescription.text = items.first().description
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
