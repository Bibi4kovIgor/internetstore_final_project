create table if not exists checks(
    id uuid default uuid_generate_v4(),
    product_id uuid,
--    vendor_code varchar not null,
    quantity integer not null,
    primary key (id),
    foreign key(product_id) references products(id)

);
