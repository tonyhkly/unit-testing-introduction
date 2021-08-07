package realcode;


public class homeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(Layout.fragment_home, container, false);

        Button topButton = (Button) view.findViewById(Id.tops);
        Button bottomButton = (Button) view.findViewById(Id.bottoms);
        Button accButton = (Button) view.findViewById(Id.accessories);
        Button shoesButton = (Button) view.findViewById(Id.shoes);

        topButton.setOnClickListener(this);
        bottomButton.setOnClickListener(this);
        accButton.setOnClickListener(this);
        shoesButton.setOnClickListener(this);

        return view;
    }

    public void onClick (View view){
        //opening an activity depending on item category
/*        switch (view.getId()) {
            case Id.tops:
                Intent intentTops = new Intent(getContext(), topFragment.class);
                startActivity(intentTops);
                break;
            case Id.bottoms:
                Intent intentBot = new Intent(getContext(), bottomsFragment.class);
                startActivity(intentBot);
                break;
            case Id.accessories:
                Intent intentAcc = new Intent(getContext(), accessoriesFragment.class);
                startActivity(intentAcc);
                break;
            case Id.shoes:
                Intent intentShoes = new Intent(getContext(), shoesFragment.class);
                startActivity(intentShoes);
                break;
        }*/
    }

}
