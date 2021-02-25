package org.techtown.tistrory4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class Frag1 extends Fragment {

    private SharedViewModel sharedViewModel;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false );
        textView = view.findViewById(R.id.textView);

        Button button = view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String hi = "안녕";
                long money = 5000000;
                try {

                    sharedViewModel.setLiveDataString(hi);//Frag2
                    sharedViewModel.setLiveDataLong(money); //Frag3
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        //이렇게 각각 데이터를 보내줍니다.

        return view;

    }

    //onCreateView에서 리턴해준 View(rootView)를 가지고 있다.
    //저장된 뷰가 반환된 직후에 호출됩니다.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) { //뷰가 제공되는 경우 반환된 뷰를 가져옵니다.
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        //지정된 Factory를 통해 ViewModel을 만들고 지정된 ViewModelStoreOwner의 저장소에 유지하는 ViewModelProvider를 만듭니다.

    }
}
