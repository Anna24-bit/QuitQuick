//package org.baltimorecityschools.quitquickapp.ui.contacts;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.lifecycle.ViewModelProvider;
//
//
//import org.baltimorecityschools.quitquickapp.databinding.FragmentGalleryBinding;
//
//public class ContactsFragment extends Fragment {
//
//    private ContactsViewModel contactsViewModel;
//
//    public static ContactsFragment newInstance() {
//        return new ContactsFragment();
//    }
//
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(b.layout.fragment_contacts, container, false);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        contactsViewModel = new ViewModelProvider(this).get(ContactsViewModel.class);
//        // TODO: Use the ViewModel
//    }
//
//}