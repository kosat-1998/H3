package com.example.onlineshoping1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.onlineshoping1.model.Product
import kotlinx.android.synthetic.main.activity_main.*
import com.example.onlineshoping1.Adapter.ProductAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //  1 -> load data into the arraylist



        var productArray =  ArrayList<Product>()

        productArray.add(Product(R.drawable.n12,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n3,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n5,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n6,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n7,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n8,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n9,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n10,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n12,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n13,"Nike Air Max","$2000"))
        productArray.add(Product(R.drawable.n14,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n15,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n16,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n17,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.n18,"Nike Yankee Stadium","$1500"))
        productArray.add(Product(R.drawable.n19,"Nike Yankee Stadium","$1000"))
        productArray.add(Product(R.drawable.nike1,"Nike Yankee Stadium","$1500"))






        //  2 -> assign(equals) with adapter's arraylist

        var productAdapter =  ProductAdapter(productArray)


        // 3 -> create a layoutmanager


        recyclerview.layoutManager =  GridLayoutManager(this,2)



        //  4 -> access the recyclerview adapter and load the data into it

        recyclerview.adapter = productAdapter






    }
}
