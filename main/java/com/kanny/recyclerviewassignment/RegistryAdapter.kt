package com.kanny.recyclerviewassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kanny.recyclerviewassignment.databinding.RegistryItemBinding

class RegistryAdapter(val studentNames: List<NameRegistry>) : RecyclerView.Adapter<RegistryAdapter.RegistryViewHolder>() {

    class RegistryViewHolder(val binding: RegistryItemBinding): RecyclerView.ViewHolder(binding.root){

            fun bind(studentNames: NameRegistry){
                binding.studentFirstName.text = studentNames.firstNam
                binding.studentFirstName.text = studentNames.lastNam

                if (studentNames.pic) {
                    binding.imageFace.setImageResource(R.drawable.ic_boy)
                }else {
                    binding.imageFace.setImageResource(R.drawable.ic_female)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegistryViewHolder {
        val binding: RegistryItemBinding = RegistryItemBinding.inflate(LayoutInflater.from(parent.context))
        return RegistryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RegistryViewHolder, position: Int) {
        val stud = studentNames.get(position)
        holder.bind(stud)
    }

    override fun getItemCount(): Int {
        return studentNames.size
    }


}