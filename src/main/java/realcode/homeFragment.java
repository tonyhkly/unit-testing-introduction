package realcode;


import static realcode.Id.accessories;
import static realcode.Id.bottoms;
import static realcode.Id.shoes;
import static realcode.Id.tops;

public class homeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(Layout.fragment_home, container, false);

        Button topButton = (Button) view.findViewById(tops);
        Button bottomButton = (Button) view.findViewById(bottoms);
        Button accButton = (Button) view.findViewById(accessories);
        Button shoesButton = (Button) view.findViewById(shoes);

        topButton.setOnClickListener(this);
        bottomButton.setOnClickListener(this);
        accButton.setOnClickListener(this);
        shoesButton.setOnClickListener(this);

        return view;
    }

    public void onClick (View view){
        //opening an activity depending on item category
        switch (view.getId()) {
            case tops:
                Intent intentTops = new Intent(getContext(), new topFragment());
                startActivity(intentTops);
                break;
            case bottoms:
                Intent intentBot = new Intent(getContext(), new bottomsFragment());
                startActivity(intentBot);
                break;
            case accessories:
                Intent intentAcc = new Intent(getContext(), new accessoriesFragment());
                startActivity(intentAcc);
                break;
            case shoes:
                Intent intentShoes = new Intent(getContext(), new shoesFragment());
                startActivity(intentShoes);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

}
