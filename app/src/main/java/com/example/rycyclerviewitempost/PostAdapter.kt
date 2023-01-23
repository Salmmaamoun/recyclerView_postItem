package com.example.rycyclerviewitempost

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.rycyclerviewitempost.PostAdapter.ViewHolder

class PostAdapter(var itemList: MutableList<PostItem>) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.carditem, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.userName.setText(item.nameUser)
        if (item.photoUser != null)
            holder.userPhoto.setImageResource(item.photoUser)
        if (item.pastHour != null)
            holder.pastHour.setText(item.pastHour.toString())
        if (item.languageIcon != null) {
            holder.iconPhoto.setImageResource(item.languageIcon)
        }
        holder.threeDots.setText(item.threeDots)
        holder.postText.setText(item.postText)
        holder.linkPost.setText(item.postLink)
        if (item.Postphoto != null)
            holder.postPhoto.setImageResource(item.Postphoto)
        if (item.photoNumOfLike != null)
            holder.photoNumOfLike.setImageResource(item.photoNumOfLike)
        if (item.numOfLike != null)
            holder.numOfLike.setText(item.numOfLike.toString())
        if (item.photoNumofShar != null)
            holder.photoNumOfShare.setImageResource(item.photoNumofShar)
        holder.numOfShar.setText(item.numOfShare)
        if (item.photoLike != null)
            holder.likeImg.setImageResource(item.photoLike)
        holder.LikeTv.setText(item.tvLike)
        if (item.photoComment != null)
            holder.commitImg.setImageResource(item.photoComment)
        holder.commitTv.setText(item.tvComment)
        if (item.photoShare != null)
            holder.likeImg.setImageResource(item.photoShare)
        holder.shareTv.setText(item.tvShare)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView = itemView.findViewById(R.id.nameTv);
        val userPhoto: ImageView = itemView.findViewById(R.id.img_photoUser)
        val pastHour: TextView = itemView.findViewById(R.id.hourTv)
        val iconPhoto: ImageView = itemView.findViewById(R.id.hrImg)
        val threeDots: TextView = itemView.findViewById(R.id.tvDots)
        val postText: TextView = itemView.findViewById(R.id.postTv)
        val linkPost: TextView = itemView.findViewById(R.id.linkTv)
        val postPhoto: ImageView = itemView.findViewById(R.id.imgPost)
        val photoNumOfLike: ImageView = itemView.findViewById(R.id.imgNumOfLike)
        val photoNumOfShare: ImageView = itemView.findViewById(R.id.imgShar)
        val numOfShar: TextView = itemView.findViewById(R.id.numOfshar)
        val likeImg: ImageView = itemView.findViewById(R.id.imgLike)
        val numOfLike: TextView = itemView.findViewById(R.id.numOfLike)
        val LikeTv: TextView = itemView.findViewById(R.id.liketxt)
        val commitImg: ImageView = itemView.findViewById(R.id.imgComment)
        val commitTv: TextView = itemView.findViewById(R.id.commenttxt)
        val shareImg: ImageView = itemView.findViewById(R.id.imgShare)
        val shareTv: TextView = itemView.findViewById(R.id.sharetxt)

    }


}

private fun Int?.let(function: () -> Unit) {

}






