package com.facturafacil.app.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.facturafacil.app.databinding.ItemMenuOptionBinding
import com.facturafacil.app.model.MenuOption

class MenuAdapter(
    private val items: List<MenuOption>,
    private val onClick: (MenuOption) -> Unit
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = ItemMenuOptionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class MenuViewHolder(
        private val binding: ItemMenuOptionBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MenuOption) {
            binding.menuIcon.setImageResource(item.iconRes)
            binding.menuTitle.text = item.title
            binding.menuSubtitle.text = item.subtitle
            binding.root.setOnClickListener { onClick(item) }
        }
    }
}
