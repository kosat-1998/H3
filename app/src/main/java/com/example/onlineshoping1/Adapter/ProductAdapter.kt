package com.example.onlineshoping1.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshoping1.R
import com.example.onlineshoping1.model.Product
import kotlinx.android.synthetic.main.item_product.view.*

class ProductAdapter(var productlist: ArrayList<Product> ): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

inner class ProductViewHolder (var view : View) : RecyclerView.ViewHolder(view){




    fun bindProduct (product: Product){

        view.image.setImageResource(product.image)
        view.brandName.text = product.name
        view.price.text = product.price


    }

}

    //  1-> Inflates the item views

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        var myview = LayoutInflater.from(parent.context).inflate(R.layout.item_product,parent,false)
        return ProductViewHolder(myview)
    }


    // 2 -> gets the number of person in the list

    override fun getItemCount(): Int {

        return  productlist.size
    }

    // 3 -> binds each variable in the arraylist to a view


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        holder.bindProduct(productlist.get(position))
    }




}