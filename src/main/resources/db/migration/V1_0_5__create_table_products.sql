create table if not exists products (
    id uuid default uuid_generate_v4(),
    vendor_code varchar unique not null,
    name varchar not null,
    description varchar not null,
    availability boolean DEFAULT FALSE,
    price numeric not null,
    category_id uuid not null,
    supplier_id uuid not null,
    primary key (id),
    foreign key(category_id) references categories(id),
    foreign key(supplier_id) references suppliers(id)
);