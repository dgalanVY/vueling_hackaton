package com.dgalan.vueling_hackaton.logistic.presentation.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dgalan.vueling_hackaton.R
import com.dgalan.vueling_hackaton.logistic.domain.model.Logistic

class LogisticAdapter(
    private val data: MutableList<Logistic> = mutableListOf(),

) : RecyclerView.Adapter<LogisticAdapter.LogisticViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogisticViewHolder {
        val rootView: View = LayoutInflater.from(parent.context).inflate(R.layout.logistic_adapter_row, parent, false)
        return LogisticViewHolder(itemView = rootView)
    }

    override fun onBindViewHolder(holder: LogisticViewHolder, position: Int) {
        holder.bindData(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun updateData(newData: List<Logistic>) {
        data.addAll(newData.toMutableList())
        notifyDataSetChanged()
    }

    inner class LogisticViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvHandlingFunction: TextView by lazy { itemView.findViewById(R.id.tv_handling_function) }
        private val tvHour: TextView by lazy { itemView.findViewById(R.id.tv_hour) }
        private val tvDay: TextView by lazy { itemView.findViewById(R.id.tv_day) }
        private val tvFullTime: TextView by lazy { itemView.findViewById(R.id.tv_full_time_employees) }
        private val tvPartTime: TextView by lazy { itemView.findViewById(R.id.tv_part_time_employees) }
        private val tvFullCost: TextView by lazy { itemView.findViewById(R.id.tv_full_cost) }
        private val tvPartCost: TextView by lazy { itemView.findViewById(R.id.tv_part_cost) }
        private val tvTotalCost: TextView by lazy { itemView.findViewById(R.id.tv_total_cost) }

        fun bindData(logistic: Logistic) {
            //imgSet(logistic.gender)
            tvHandlingFunction.text = logistic.handlingFunction
            tvHour.text = logistic.hour.toString()
            tvDay.text = logistic.day
            tvFullTime.text = logistic.fullTimeEmployees.toString()
            tvPartTime.text = logistic.partTimeEmployees.toString()
            tvFullCost.text = logistic.fullTimeCost.toString()
            tvPartCost.text = logistic.partTimeCost.toString()
            tvTotalCost.text = logistic.totalCost.toString()
        }

//        private fun imgSet(gender: String) {
//            when(gender) {
//                MALE -> imgGender.setImageResource(R.drawable.img_male)
//                FEMALE -> imgGender.setImageResource(R.drawable.img_female)
//                else -> imgGender.setImageResource(R.drawable.img_unknown)
//            }
//        }

    }

}