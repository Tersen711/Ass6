package Builder;

public interface myHouse {

    public House.HouseBuilder setAddress(String add);
    public House.HouseBuilder setVolume(int vol);
    public House.HouseBuilder setQuantityOfRooms(int q);
    public House.HouseBuilder setQuantityOfRestrooms(int q);
    public House.HouseBuilder setPrice(int p);

}
