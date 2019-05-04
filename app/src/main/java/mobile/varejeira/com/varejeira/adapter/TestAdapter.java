package mobile.varejeira.com.varejeira.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.varejeira.mobile.R;

import java.util.List;

import mobile.varejeira.com.varejeira.models.TestModelFromJson;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    private List<TestModelFromJson> dataList;
    private Context context;

    public TestAdapter(Context context, List<TestModelFromJson> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtTitle;

        TestViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            txtTitle = mView.findViewById(R.id.title);
        }
    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TestViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

}
