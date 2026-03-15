package com.example.notesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private ArrayList<Note> notes;

    public NoteAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_view_holder, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        Note note = notes.get(position);

        holder.noteIdText.setText(String.valueOf(note.getId()));
        holder.noteTimeAndDateText.setText(note.getTimeAndDate());
        holder.noteTitleText.setText(note.getTitle());
        holder.noteContentText.setText(note.getContent());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class NoteViewHolder extends RecyclerView.ViewHolder {

        TextView noteIdText;
        TextView noteTimeAndDateText;
        TextView noteTitleText;
        TextView noteContentText;
    }

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);

        noteIdText = itemView.findViewById(R.id.NoteIdText);
        noteTimeAndDateText = itemView.findViewById(R.id.NoteTimeAndDateText);
        noteTitleText = itemView.findViewById(R.id.NoteTitleText);
        noteContentText = itemView.findViewById(R.id.NoteContentText);
    }

}
