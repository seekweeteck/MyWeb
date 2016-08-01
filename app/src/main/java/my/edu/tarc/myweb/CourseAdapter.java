package my.edu.tarc.myweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TARC on 8/6/2015.
 */
public class CourseAdapter extends ArrayAdapter<Course> {
    public CourseAdapter(Context context, int resource, List<Course> l) {
        super(context, resource, l);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Obtain a course record
        Course course = getItem(position);

        //Check if an existing view is being used
        if(convertView ==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.course_record, parent, false);
        }

        TextView textViewCode, textViewTitle, textViewCredit;

        textViewCode = (TextView)convertView.findViewById(R.id.textViewCode);
        textViewTitle = (TextView)convertView.findViewById(R.id.textViewTitle);
        textViewCredit = (TextView)convertView.findViewById(R.id.textViewCredit);

        textViewCode.setText("Code:"+ course.getCode());
        textViewTitle.setText("Title:" + course.getTitle());
        textViewCredit.setText("Credit:"+ course.getCredit());
        return convertView;
    }
}
