/**
 * Created by student on 2018-01-31.
 */

public class adapter {
    // przygotowanie Adaptera dla RecyclerView
    public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        // przygotowanie ViewHolder dla RecyclerView
        public class ViewHolder extends RecyclerView.ViewHolder {
            public ViewHolder(View itemView) {
                super(itemView);
                // wykorzystanie butterknifa w viewholderze
                ButterKnife.bind(this, itemView);
            }

            // ustawienie nazwy leku oraz jego dawki
            @BindView(R.id.nazwiska)
            TextView ItemNazwiska;

            @BindView(R.id.dawka)
            TextView ItemDawka;


            private void setItemNazwiska(String nazwiska) {
                ItemNazwa.setText(nazwa);
            }

            private void setItemSpecjalizacja(Integer specjalizacja) {
                ItemDawka.setText(dawka);
            }
        }
    }
}

