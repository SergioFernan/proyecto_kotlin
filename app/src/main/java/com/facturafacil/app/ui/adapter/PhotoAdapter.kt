package com.facturafacil.app.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.facturafacil.app.databinding.ItemPhotoBinding
import com.facturafacil.app.model.PhotoItem

class PhotoAdapter(
    private val items: List<PhotoItem>,
    private val onClick: (PhotoItem) -> Unit
) : RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class PhotoViewHolder(
        private val binding: ItemPhotoBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PhotoItem) {
            binding.photoIcon.setImageResource(item.iconRes)
            binding.photoTitle.text = item.title
            binding.root.setOnClickListener { onClick(item) }
        }
    }
}
