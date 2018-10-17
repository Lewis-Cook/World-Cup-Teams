package uk.co.lewiscook.worldcup2018.github.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import uk.co.lewiscook.worldcup2018.R;
import uk.co.lewiscook.worldcup2018.github.model.Repo;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoViewHolder> {

    private List<Repo> mList = new ArrayList<>();

    private RepoViewHolder repoViewHolder;

    public void setData(List<Repo> mData) {
        mList = mData;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RepoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View repoListItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_repo_list_item, viewGroup, false);
        repoViewHolder = new RepoViewHolder(repoListItem);
        return repoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RepoViewHolder viewHolder, int position) {

        Repo r = mList.get(position);
        viewHolder.setTitle(r.name);
        viewHolder.setDescription(r.description);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * This is the view holder
     */
    static class RepoViewHolder extends RecyclerView.ViewHolder {

        TextView titleView;

        TextView descriptionView;

        public RepoViewHolder(@NonNull View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.repo_title);
            descriptionView = itemView.findViewById(R.id.repo_description);
        }

        public void setTitle(String title) {
            titleView.setText(title);
        }

        public void setDescription(String description) {
            descriptionView.setText(description);
        }
    }
}
