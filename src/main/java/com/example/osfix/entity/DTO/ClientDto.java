package com.example.osfix.entity.DTO;

public class ClientDto {
        private Long id;
        private String name;
        private String webSite;
        private String comment;

        public ClientDto(Long id, String name, String webSite, String comment) {
            this.id = id;
            this.name = name;
            this.webSite = webSite;
            this.comment = comment;
        }

    public ClientDto(String name, String webSite, String comment) {
        this.name = name;
        this.webSite = webSite;
        this.comment = comment;
    }

        public ClientDto(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

         public String getName() {
            return name;
        }

        public String getSite() {
            return webSite;
        }

        public String getComment() {
            return comment;
        }
}
