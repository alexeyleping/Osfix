create table application_products
        (
        application_id bigserial references application not null,
        product_id     bigserial references products    not null,
        constraint request_mailing_geography_pkey
        primary key (application_id, product_id)
        );